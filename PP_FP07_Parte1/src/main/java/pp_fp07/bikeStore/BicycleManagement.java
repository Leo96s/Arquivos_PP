package pp_fp07.bikeStore;
import pp_fp07.enumerations.BikeTools;
import pp_fp07.enumerations.Brakes_Type;
import pp_fp07.enumerations.Material_Type;
import pp_fp07.enumerations.Suspension_Type;

public class BicycleManagement {
    private Node first;
    
    private class Node {
        private Bicycle bicycle;
        private RoadBike roadBike;
        private MountainBike mountainBike;
        private Node next;


        public Node(RoadBike roadBike) {
            this.roadBike = roadBike;
            next = null;
        }

        public Node(MountainBike mountainBike) {
            this.mountainBike = mountainBike;
            next = null;
        }
    }

    public void addRoadBike(RoadBike roadBike) {
        Node newNode = new Node(roadBike);
        if (first == null) {
            first = newNode;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addMountainBike(MountainBike mountainBike) {
        Node newNode = new Node(mountainBike);
        if (first == null) {
            first = newNode;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(RoadBike rbike) {
        if (first == null) {
            return;
        }
        if (first.roadBike == rbike) {
            first = first.next;
            return;
        }
        Node current = first;
        while (current.next != null) {
            if (current.next.roadBike == rbike) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void remove(MountainBike mbike) {
        if (first == null) {
            return;
        }
        if (first.mountainBike == mbike) {
            first = first.next;
            return;
        }
        Node current = first;
        while (current.next != null) {
            if (current.next.mountainBike == mbike) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void list() {
        if (first == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        Node current = first;
        while (current != null) {
            if (current.roadBike != null) {
                System.out.println("Bike id: " + current.roadBike.getId());
                System.out.println("Handle belt:" + current.roadBike.gethandlebelt());
                System.out.println("Number of Gears:" + current.roadBike.getnumberOfGears());
                System.out.println("Main Color: " + current.roadBike.getmainColor());
                System.out.println("Wheel Size: " + current.roadBike.getwheelSize());
                System.out.println("Type of Brakes: " + current.roadBike.getbrakes());
                System.out.println("Made of: " + current.roadBike.getmaterial());
                System.out.println("Price: " + current.roadBike.getprice());
                System.out.println("Guarantee: " + current.roadBike.getguarantee() + " " + "anos");
                System.out.println("Frame Size: " + current.roadBike.getframeSize());
                System.out.println("Observations: " + current.roadBike.getobservations());

            } else if (current.mountainBike != null) {
                System.out.println("Bike id: " + current.mountainBike.getId());
                System.out.println("Number of Gears: " + current.mountainBike.getnumbroflights());
                System.out.println("Main Color: " + current.mountainBike.getmainColor());
                System.out.println("Wheel Size: " + current.mountainBike.getwheelSize());
                System.out.println("Type of Brakes: " + current.mountainBike.getbrakes());
                System.out.println("Made of: " + current.mountainBike.getmaterial());
                System.out.println("Price: " + current.mountainBike.getprice());
                System.out.println("Guarantee: " + current.mountainBike.getguarantee());
                System.out.println("Number of Lights: " + current.mountainBike.getnumbroflights());
                System.out.println("Type of Suspension: " + current.mountainBike.getsuspension());
                for(BikeTools _biketoo: current.mountainBike.getbiketools()){
                    System.out.println("Tools: " + BikeTools.biketoolsToString(_biketoo));
                }                
            }
            current = current.next;
        }
    }
    
       
    public void listMountainBike() {
            if (first == null) {
                System.out.println("A lista está vazia.");
                return;
            }
            Node current = first;
            while (current != null) {
                if (current.mountainBike != null) {
                    System.out.println("MountainBike: " + current.mountainBike.getId());
                    System.out.println("Number of Gears: " + current.mountainBike.getnumbroflights());
                    System.out.println("Main Color: " + current.mountainBike.getmainColor());
                    System.out.println("Wheel Size: " + current.mountainBike.getwheelSize());
                    System.out.println("Type of Brakes: " + current.mountainBike.getbrakes());
                    System.out.println("Made of: " + current.mountainBike.getmaterial());
                    System.out.println("Price: " + current.mountainBike.getprice());
                    System.out.println("Guarantee: " + current.mountainBike.getguarantee());
                    System.out.println("Number of Lights: " + current.mountainBike.getnumbroflights());
                    System.out.println("Type of Suspension: " + current.mountainBike.getsuspension());
                    for(BikeTools _biketoo: current.mountainBike.getbiketools()){
                        System.out.println("Tools: " + BikeTools.biketoolsToString(_biketoo));
                    }                
                }
                current = current.next;
            }
        }
    }




