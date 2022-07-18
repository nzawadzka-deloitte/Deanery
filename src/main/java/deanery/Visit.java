package deanery;

import deanery.exception.WrongHour;
import deanery.exception.WrongNumber;
import deanery.room.Room;
import deanery.student.Student;

import java.util.List;

public class Visit {
    static List<Room> rooms = RoomData.createRooms();
    public static void visitation(Student student, String visitRoom, Integer visitHour)
        throws WrongNumber, WrongHour {
        for(int i =0; i< rooms.size(); i++){
            if(visitRoom==rooms.get(i).getNumber() && student.getType()==rooms.get(i).getType()){
                System.out.println(rooms.get(i).getNumber());
            }else {
                throw new WrongNumber("Wrong number");
            }
        }



    }
}
