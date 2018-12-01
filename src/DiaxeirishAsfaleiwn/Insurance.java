package DiaxeirishAsfaleiwn;

import java.util.Date;

public class Insurance {
    boolean statusi;
    Date date_start;
    Date date_end;
    int id;

    public Insurance(boolean statusi, Date date_start, Date date_end, int id) {
        this.statusi = statusi;
        this.date_start = date_start;
        this.date_end = date_end;
        this.id = id;
    }

    public boolean isStatusi() {
        return statusi;
    }

    public void setStatusi(boolean statusi) {
        this.statusi = statusi;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
