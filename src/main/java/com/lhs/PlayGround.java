package com.lhs;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class PlayGround {

    private Map<LocalTime, Boolean> slots = new HashMap();

    public static void main(String[] args) {
        PlayGround client = new PlayGround();
        client.initializeSlots();

        client.allocateSlots("10:00", "13:00");
        //this shouldn't be available
        client.allocateSlots("11:00", "12:00");
        //not sure if u want this to be available. since it is start when the 1st just finished. 
        client.allocateSlots("13:00", "15:00");
        client.allocateSlots("16:00", "18:00");
    }

    private void initializeSlots() {

        LocalTime time = LocalTime.of(9, 0);
        slots.put(time, true);
        for (int i = 1; i < 24; i++) {
            slots.put(time.plusHours(i), true);
        }
    }

    private void allocateSlots(String strTime, String edTime) {
    	strTime="1:30";
    	strTime="4:50";
        LocalTime startTime = LocalTime.parse(strTime);
        LocalTime endTime = LocalTime.parse(edTime);

        while (startTime.isBefore(endTime)) {
            //check if the time slots between start and end time are available
            if (!slots.get(startTime) || !slots.get(endTime)) {
                System.out.println("slots not available" + " start time: " + strTime + " end time: " + edTime);
                return;
            }
            startTime = startTime.plusHours(1);
            endTime = endTime.minusHours(1);
        }

        System.out.println("slots are available" + " start time: " + strTime + " end time: " + edTime);
        //then here u can mark all slots between to unavailable.
        startTime = LocalTime.parse(strTime);
        endTime = LocalTime.parse(edTime);
        while (startTime.isBefore(endTime)) {
            slots.put(startTime, false);
            slots.put(endTime, false);
            startTime = startTime.plusHours(1);
            endTime = endTime.minusHours(1);
        }
    }

}
