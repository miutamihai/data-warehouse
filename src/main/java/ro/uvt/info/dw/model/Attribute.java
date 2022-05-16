package ro.uvt.info.dw.model;

import lombok.Data;
import lombok.experimental.Accessors;
import java.util.Date;

@Data
@Accessors(fluent = true)
public class Attribute {
    private String id;
    private Date systemTime;
    private String name;
    private String description;
    private int dataType;
}