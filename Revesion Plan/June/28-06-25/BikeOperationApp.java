import java.util.Scanner;

class Vehicle {
    String vehicleNo;
    double[] fuelConsumed = new double[7];

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setFuelConsumedAtDay(int day, double fuel) {
        if (day >= 0 && day < 7)
            this.fuelConsumed[day] = fuel;
    }
    public double getFuelConsumedAtDay(int day) {
        if (day >= 0 && day < 7)
            return fuelConsumed[day];
        return 0;
    }
}

class Bike extends Vehicle {
    double[] distanceCovered = new double[7];

    public void setDistanceCoveredAtDay(int day, double dist) {
        if (day >= 0 && day < 7)
            this.distanceCovered[day] = dist;
    }
    public double getDistanceCoveredAtDay(int day) {
        if (day >= 0 && day < 7)
            return distanceCovered[day];
        return 0;
    }

    public double getOverallAverageMileage() {
        double totalDistance = 0;
        double totalFuel = 0;
        for (int i = 0; i < 7; i++) {
            totalDistance += distanceCovered[i];
            totalFuel += fuelConsumed[i];
        }
        if (totalFuel == 0) return 0;
        return totalDistance / totalFuel;
    }

    public double getMileageAtDay(int day) {
        if (fuelConsumed[day] == 0) return 0;
        return distanceCovered[day] / fuelConsumed[day];
    }

    @Override
    public String toString() {
        return "Vehicle No: " + vehicleNo + ", Average Mileage: " + String.format("%.2f", getOverallAverageMileage());
    }
}

public class BikeOperationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bike[] bikes = new Bike[3];

        for (int i = 0; i < bikes.length; i++) {
            bikes[i] = new Bike();
            System.out.println("Enter details for Bike " + (i + 1));

            System.out.print("Vehicle Number: ");
            bikes[i].setVehicleNo(sc.nextLine());

            System.out.println("Enter fuel consumed and distance covered for 7 days:");

            for (int day = 0; day < 7; day++) {
                System.out.print("Day " + (day + 1) + " fuel consumed: ");
                double fuel = sc.nextDouble();
                bikes[i].setFuelConsumedAtDay(day, fuel);

                System.out.print("Day " + (day + 1) + " distance covered: ");
                double dist = sc.nextDouble();
                bikes[i].setDistanceCoveredAtDay(day, dist);
            }
            sc.nextLine(); // consume newline
        }

        System.out.println("\n--- Average Mileage per Bike ---");
        for (Bike b : bikes) {
            System.out.println(b);
        }

        Bike bestBike = bikes[0];
        for (int i = 1; i < bikes.length; i++) {
            if (bikes[i].getOverallAverageMileage() > bestBike.getOverallAverageMileage()) {
                bestBike = bikes[i];
            }
        }
        System.out.println("\nBike with Best Overall Average Mileage:");
        System.out.println(bestBike);

        double lowestAvgMileage = Double.MAX_VALUE;
        int lowestDay = -1;

        for (int day = 0; day < 7; day++) {
            double sumMileage = 0;
            int countValid = 0;

            for (Bike b : bikes) {
                double mileage = b.getMileageAtDay(day);
                if (mileage > 0) {
                    sumMileage += mileage;
                    countValid++;
                }
            }

            if (countValid > 0) {
                double avgMileage = sumMileage / countValid;
                if (avgMileage < lowestAvgMileage) {
                    lowestAvgMileage = avgMileage;
                    lowestDay = day;
                }
            }
        }

        System.out.println("\nDay with Lowest Average Mileage Across All Bikes: Day " + (lowestDay + 1));
        System.out.printf("Lowest Average Mileage: %.2f\n", lowestAvgMileage);

        sc.close();
    }
}
