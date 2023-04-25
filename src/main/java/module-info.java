module org.alda.dsm.utl.examensqlnube {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.alda.dsm.utl.examensqlnube to javafx.fxml;
    exports org.alda.dsm.utl.examensqlnube;
}