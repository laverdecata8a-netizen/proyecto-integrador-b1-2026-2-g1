package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.model.Avistamiento;
import com.example.model.Foto;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("GatoGo")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("GatoGo");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();

        tabSheet.add("Gatos", crearSeccionGato());
        tabSheet.add("Ubicacion", crearSeccionUbicacion());
        tabSheet.add("User", crearSeccionUser());
        tabSheet.add("Avistamientos", crearSeccionAvistamiento());
        tabSheet.add("Foto", crearSeccionFoto());
        add(titulo, tabSheet);
        
    }


    }

    // Método privado para gestionar la primera entidad
    private Component crearSeccionGato() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        idField.setReadOnly(true);

        TextField nombreField = new TextField("Nombre");
        TextField colorField = new TextField("Color");
        DatePicker fechaIngresoField = new DatePicker("Fecha de ingreso");
        TextArea descripcionField = new TextArea("Descripción");

        FormLayout form = new FormLayout(idField,nombreField,colorField,fechaIngresoField,descripcionField );

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Gato - Crear: " + nombreField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Gato - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Gato - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Gato - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            colorField.clear();
            fechaIngresoField.clear();
            descripcionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();

        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Color").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Fecha de ingreso").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("Descripción").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

// Método privado para gestionar la ubicacion

    private Component crearSeccionUbicacion() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idUbicacionField = new TextField("ID Ubicacion");
        idUbicacionField.setReadOnly(true);

        TextField direccionField = new TextField("Direccion");
        TextField barrioField = new TextField("Barrio");
        TextField ciudadField = new TextField("Ciudad");

        FormLayout form = new FormLayout(idUbicacionField,direccionField ,barrioField,ciudadField );

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Ubicacion - Crear: " + direccionField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Ubicacion - Consultar ID: " + idUbicacionField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Ubicacion - Actualizar ID: " + idUbicacionField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Ubicacion - Eliminar ID: " + idUbicacionField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idUbicacionField.clear();
            direccionField.clear();
            barrioField.clear();
            ciudadField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();

        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Direccion").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Barrio").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Ciudad").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }


    // Método privado para gestionar la segunda entidad
    private Component crearSeccionUser() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        idField.setReadOnly(true);

        TextField nombreField = new TextField("Nombre");
        TextField apellidoField = new TextField("Apellido");
        EmailField emailField = new EmailField("Email");
        TextField celularField = new TextField("Celular");
        PasswordField passwordField = new PasswordField("Contraseña");

        FormLayout form = new FormLayout(idField,nombreField,apellidoField,emailField,celularField,passwordField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("User - Crear: " + nombreField .getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("User - Consultar Código: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("User - Actualizar Código: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("User - Eliminar Código: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
        idField.clear();
        nombreField.clear();
        apellidoField.clear();
        emailField.clear();
        celularField.clear();
        passwordField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Apellido").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Email").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("Celular").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    //Fotos
    private Component crearSeccionFoto() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        List<Foto> fotos = new ArrayList<>();
        int[] siguienteId = { 1 };

        TextField idFotoField = new TextField("ID Foto");
        idFotoField.setReadOnly(false);

        IntegerField idGatoField = new IntegerField("ID Gato");
        idGatoField.setMin(1);
        idGatoField.setRequiredIndicatorVisible(true);

        TextField urlField = new TextField("URL de la foto");
        DatePicker fechaFotoField = new DatePicker("Fecha de la foto");
        Checkbox esPrincipalCheckbox = new Checkbox("¿Es foto principal?");
        TextArea descripcionField = new TextArea("Descripción");

        FormLayout form = new FormLayout(idFotoField, idGatoField, urlField, fechaFotoField, esPrincipalCheckbox, descripcionField);

        Grid<Foto> grid = new Grid<>(Foto.class, false);
        grid.addColumn(Foto::getIdFoto).setHeader("ID Foto").setAutoWidth(true);
        grid.addColumn(Foto::getIdGato).setHeader("ID Gato").setAutoWidth(true);
        grid.addColumn(Foto::getUrl).setHeader("URL").setAutoWidth(true);
        grid.addColumn(Foto::getFechaFoto).setHeader("Fecha").setAutoWidth(true);
        grid.addColumn(f -> f.getEsPrincipal() ? "Sí" : "No").setHeader("Es Principal").setAutoWidth(true);
        grid.addColumn(Foto::getDescripcion).setHeader("Descripción").setAutoWidth(true);
        grid.setItems(fotos);

        grid.addItemClickListener(event -> mostrarFoto(event.getItem(), idFotoField, idGatoField, urlField, fechaFotoField, esPrincipalCheckbox, descripcionField));

        Button btnCrear = new Button("Crear", e -> {
            if (idGatoField.getValue() == null || fechaFotoField.getValue() == null || urlField.getValue().isBlank()) {
                Notification.show("Completa los campos obligatorios (ID Gato, URL y Fecha).");
                return;
            }

            Foto foto = new Foto(
                siguienteId[0]++,
                idGatoField.getValue(),
                urlField.getValue(),
                fechaFotoField.getValue().toString(),
                esPrincipalCheckbox.getValue(),
                descripcionField.getValue()
            );

            fotos.add(foto);
            grid.getDataProvider().refreshAll();
            Notification.show("Foto creada con éxito.");
            limpiarFoto(idFotoField, idGatoField, urlField, fechaFotoField, esPrincipalCheckbox, descripcionField);
        });
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> {
            Optional<Foto> encontrada = buscarFoto(idFotoField, fotos);
            if (encontrada.isPresent()) {
                mostrarFoto(encontrada.get(), idFotoField, idGatoField, urlField, fechaFotoField, esPrincipalCheckbox, descripcionField);
            } else {
                Notification.show("No existe una foto con ese ID.");
            }
        });

        Button btnActualizar = new Button("Actualizar", e -> {
            Optional<Foto> encontrada = buscarFoto(idFotoField, fotos);
            if (encontrada.isEmpty()) {
                Notification.show("Selecciona o consulta una foto existente.");
                return;
            }

            Foto foto = encontrada.get();
            foto.setIdGato(idGatoField.getValue());
            foto.setUrl(urlField.getValue());
            foto.setFechaFoto(fechaFotoField.getValue() != null ? fechaFotoField.getValue().toString() : "");
            foto.setEsPrincipal(esPrincipalCheckbox.getValue());
            foto.setDescripcion(descripcionField.getValue());

            grid.getDataProvider().refreshAll();
            Notification.show("Foto actualizada.");
            limpiarFoto(idFotoField, idGatoField, urlField, fechaFotoField, esPrincipalCheckbox, descripcionField);
        });

        Button btnEliminar = new Button("Eliminar", e -> {
            Optional<Foto> encontrada = buscarFoto(idFotoField, fotos);
            if (encontrada.isPresent()) {
                fotos.remove(encontrada.get());
                grid.getDataProvider().refreshAll();
                Notification.show("Foto eliminada.");
                limpiarFoto(idFotoField, idGatoField, urlField, fechaFotoField, esPrincipalCheckbox, descripcionField);
            } else {
                Notification.show("No existe una foto con ese ID.");
            }
        });
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> 
            limpiarFoto(idFotoField, idGatoField, urlField, fechaFotoField, esPrincipalCheckbox, descripcionField)
        );

        HorizontalLayout acciones = new HorizontalLayout(btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        layout.add(form, acciones, grid);
        return layout;
    }

    private Optional<Foto> buscarFoto(TextField idFotoField, List<Foto> fotos) {
        try {
            int id = Integer.parseInt(idFotoField.getValue());
            return fotos.stream()
                    .filter(foto -> foto.getIdFoto() == id)
                    .findFirst();
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    private void mostrarFoto(Foto foto, TextField idFotoField, IntegerField idGatoField, TextField urlField, DatePicker fechaFotoField, Checkbox esPrincipalCheckbox, TextArea descripcionField) {
        idFotoField.setValue(String.valueOf(foto.getIdFoto()));
        idGatoField.setValue(foto.getIdGato());
        urlField.setValue(foto.getUrl() != null ? foto.getUrl() : "");
        if (foto.getFechaFoto() != null && !foto.getFechaFoto().isEmpty()) {
            fechaFotoField.setValue(java.time.LocalDate.parse(foto.getFechaFoto()));
        } else {
            fechaFotoField.clear();
        }
        esPrincipalCheckbox.setValue(foto.getEsPrincipal());
        descripcionField.setValue(foto.getDescripcion() != null ? foto.getDescripcion() : "");
    }

    private void limpiarFoto(TextField idFotoField, IntegerField idGatoField, TextField urlField, DatePicker fechaFotoField, Checkbox esPrincipalCheckbox, TextArea descripcionField) {
        idFotoField.clear();
        idGatoField.clear();
        urlField.clear();
        fechaFotoField.clear();
        esPrincipalCheckbox.setValue(false);
        descripcionField.clear();
    }
}


