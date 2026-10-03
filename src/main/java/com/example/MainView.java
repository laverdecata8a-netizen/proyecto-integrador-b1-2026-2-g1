package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Gestión CRUD - 2 Entidades")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("Gestión de Entidades (CRUD)");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();

        tabSheet.add("Entidad 1", crearSeccionEntidad1());
        tabSheet.add("Entidad 2", crearSeccionEntidad2());

        add(titulo, tabSheet);
    }

    // Método privado para gestionar la primera entidad
    private Component crearSeccionEntidad1() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField descripcionField = new TextField("Descripción");

        FormLayout form = new FormLayout(idField, nombreField, descripcionField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Entidad 1 - Crear: " + nombreField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Entidad 1 - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Entidad 1 - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Entidad 1 - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            descripcionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Descripción").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la segunda entidad
    private Component crearSeccionEntidad2() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("Código / ID");
        TextField tituloField = new TextField("Título");
        TextField categoriaField = new TextField("Categoría");

        FormLayout form = new FormLayout(idField, tituloField, categoriaField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Entidad 2 - Crear: " + tituloField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Entidad 2 - Consultar Código: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Entidad 2 - Actualizar Código: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Entidad 2 - Eliminar Código: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            tituloField.clear();
            categoriaField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("Código / ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Título").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Categoría").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }
}
