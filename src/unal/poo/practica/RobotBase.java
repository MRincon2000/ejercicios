package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 0, Direction.EAST,10);
            int columnas = 5;
            int filas= 5;
        for (int i = 0; i< 5;i++){
            columnas=recogerFila(columnas);
        filas=recogerColumna(filas);
        
	}
        }
        
        public static void girarDerecha(){
  
            for (int i=0;i<3;i++){
                estudiante.turnLeft();
            }
            
        }
        public static void voltearse(){
            for (int i=0;i<2;i++){
                estudiante.turnLeft();
            }
        }
        public static void recogerUno (){
            if (estudiante.canPickThing() ==true){
                estudiante.pickThing();
            }
        }
        public static void recogerTodos (){
            while (estudiante.canPickThing() ==true){
                estudiante.pickThing();
            }
        }
            public static int recogerFila ( int columnas){
            for (int i =0;i<columnas;i++){
                estudiante.move();
                recogerTodos();
             
            }
            girarDerecha();
            return columnas-1;
            }
             public static int recogerColumna ( int filas){
            for (int i =0;i<filas;i++){
                estudiante.move();
                recogerTodos();
             
            }
            girarDerecha();
            return filas-1;
            }
}
        

