package by.issoft.domain;

import by.issoft.domain.carriages.Locomotive;

public class Train {
    Node head; // head of list/ Locomotive

    static class Node {

        Carriage data;
        Node next;

        Node(Carriage d)
        {
            data = d;
            next = null;
        }
    }

    // method to insert a new node
    public static void addCarriage(Train list, Carriage data) {
        Node newCarriage = new Node(data);


        // if the list is empty make the new Carriage the head, but make sure it is a locomotive.
        if (list.head == null) {
            if(newCarriage.data instanceof Locomotive ) {
                list.head = newCarriage;
            }
            else {
                throw new IllegalArgumentException("First carriage should be a locomotive");
            }
        }
        else {
            // else make it the last node
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newCarriage;
        }
    }

    public static void removeCarriageByID(Train list, int ID) {
        Node currCarriage = list.head, prev = null;

        // If head node itself holds the ID to be deleted
        if (currCarriage != null && currCarriage.data.getCarriageID() == ID) {
            throw new IllegalArgumentException("You can not remove the locomotive!");
        }

        while (currCarriage != null && currCarriage.data.getCarriageID() != ID) {
            prev = currCarriage;
            currCarriage = currCarriage.next;
        }

        if (currCarriage != null) {
            prev.next = currCarriage.next;
            System.out.println(ID + " found and removed");
        }
        if (currCarriage == null) {
            System.out.println(ID + " not found");
        }
    }


    public static String printTrain(Train list)
    {
        Node currCarriage = list.head;

        StringBuilder stringBuilder = new StringBuilder("Train: ");

        // Traverse through the LinkedList
        while (currCarriage != null) {
            stringBuilder.append(currCarriage.data + " ");
            currCarriage = currCarriage.next;
        }
        return stringBuilder.toString();
    }
}
