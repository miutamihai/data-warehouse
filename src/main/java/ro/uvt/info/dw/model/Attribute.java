package ro.uvt.info.dw.model;

import lombok.experimental.Accessors;

import java.util.Date;

import com.datastax.driver.core.DataType;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.cql.*;

@Table("attribute")
@Data
@Accessors(fluent = true)
public class Attribute implements TemporalEntity<Attribute> {
    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String id;

    @PrimaryKeyColumn(name = "system_time", ordinal = 1, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
    private Date systemTime;

    @Column
    private String name;

    @Column
    private String description;

    @Column("data_type")
    private DataType dataType;

    public Attribute setDataType(DataType dt) {
        this.dataType = dt.cint();
        return this;
    }

    public DataType getDataType() {
        return this.dataType;
    }
}