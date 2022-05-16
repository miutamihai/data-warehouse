package ro.uvt.info.dw.model;

import java.util.Date;

public interface TemporalEntity<T> {
    Date systemTime();
    T systemTime(Date date);
}