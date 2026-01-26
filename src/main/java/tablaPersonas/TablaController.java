package tablaPersonas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.*;

public class TablaController {
    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnModificar;

    @FXML
    private Button btnAgregar;

    @FXML
    public TextField nombreField;
    @FXML
    public TextField apellidoField;
    @FXML
    public TextField edadField;
    @FXML
    public TableView<Persona> tablaPersonas;
    @FXML
    public TableColumn columnNombre;
    @FXML
    public TableColumn columnApellido;
    @FXML
    public TableColumn columnEdad;
    private ObservableList<Persona> personas=FXCollections.observableArrayList();
    private Persona personaSeleccionada;

    @FXML
    public void initialize() {
        cargarDatos();
        // Vinculamos columnas con atributos de la clase Persona
        columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnApellido.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        columnEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));

        // Conectamos la lista a la tabla una sola vez
        tablaPersonas.setItems(personas);
    }

    public void cargarDatos(){
        File personasGuardadas=new File("personas.txt");
        try(FileReader leer=new FileReader(personasGuardadas)) {
        try(BufferedReader leerLinea=new BufferedReader(leer)) {
            if (!personasGuardadas.exists()){
                personasGuardadas.createNewFile();
            }

            String linea;
            while ((linea=leerLinea.readLine())!=null){
                String campos[]=linea.split(",");
                personas.add(new Persona(campos[0],campos[1],campos[2]));
            }
        } }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void eliminar(MouseEvent mouseEvent) {

        personas.remove(personaSeleccionada);

        personaSeleccionada=null;

        tablaPersonas.refresh();
        File personasGuardadas=new File("personas.txt");
        try(FileWriter escribir=new FileWriter(personasGuardadas)) {
            try(BufferedWriter escribirPersona=new BufferedWriter(escribir)) {
                personas.forEach(persona-> {
                    try {
                        escribirPersona.write(persona.toString()+"\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });


            } }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void AgregarPersona(MouseEvent mouseEvent) {
        Persona nuevaPersona = new Persona(
                nombreField.getText().trim(),
                apellidoField.getText().trim(),
                edadField.getText().trim()
        );


        personas.add(nuevaPersona); // La tabla se actualiza sola al ser ObservableList

        File personasGuardadas=new File("personas.txt");
        try(FileWriter escribir=new FileWriter(personasGuardadas,true)) {
            try(BufferedWriter escribirPersona=new BufferedWriter(escribir)) {

                escribirPersona.write(nuevaPersona.toString()+"\n");

            } }catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Limpiar campos después de agregar
        nombreField.clear();
        apellidoField.clear();
        edadField.clear();
    }

    public void selectPersona(MouseEvent mouseEvent) {
        personaSeleccionada = tablaPersonas.getSelectionModel().getSelectedItem();

        if (personaSeleccionada != null) {
            nombreField.setText(personaSeleccionada.getNombre());
            apellidoField.setText(personaSeleccionada.getApellidos());
            edadField.setText(personaSeleccionada.getEdad());
        }
    }

    public void modificar(MouseEvent mouseEvent) {

        personaSeleccionada.setNombre(nombreField.getText());

        personaSeleccionada.setApellidos(apellidoField.getText());

        personaSeleccionada.setEdad(edadField.getText());



        Persona personaTabla=personas.get(tablaPersonas.selectionModelProperty().get().getSelectedIndex());

        personaTabla=personaSeleccionada;



        tablaPersonas.refresh();

        File personasGuardadas=new File("personas.txt");
        try(FileWriter escribir=new FileWriter(personasGuardadas)) {
            try(BufferedWriter escribirPersona=new BufferedWriter(escribir)) {
                personas.forEach(persona-> {
                    try {
                        escribirPersona.write(persona.toString()+"\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });


            } }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
