module com.example.handlingevents_creating_event_handler_token {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.handlingevents_creating_event_handler_token to javafx.fxml;
    exports com.example.handlingevents_creating_event_handler_token;
}