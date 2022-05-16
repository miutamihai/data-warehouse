package ro.uvt.info.dw;

import org.springframework.stereotype.Repository;
import ro.uvt.info.dw.model.Attribute;
import org.springframework.data.cassandra.repository.*;

@Repository
interface AttributesRepository extends CassandraRepository<Attribute, String> { }
