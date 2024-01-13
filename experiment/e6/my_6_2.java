/*
定义一个接口Insurance，接口中有四个抽象方法：public int getPolicyNumber()；public int getCoverageAmount()；
public double calculatePremium()；
public Date getExpiryDate()。
设计一个类Car，该类实现接口的方法，编写应用程序。
*/
package experiment;

import java.util.Date;

public class my_6_2 {
    public static interface Insurance {
        public int getPolicyNumber();
        public int getCoverageAmount();
        public double calculatePremium();
        public Date getExpiryDate();
    }

    private static class Car implements Insurance {
        private int policyNumber;
        private int coverageAmount;
        private double premium;
        private Date expiryDate;

        public Car(int policyNumber, int coverageAmount, double premium, Date expiryDate) {
            this.policyNumber = policyNumber;
            this.coverageAmount = coverageAmount;
            this.premium = premium;
            this.expiryDate = expiryDate;
        }

        public int getPolicyNumber() {
            return policyNumber;
        }

        public int getCoverageAmount() {
            return coverageAmount;
        }

        public double calculatePremium() {
            return premium;
        }

        public Date getExpiryDate() {
            return expiryDate;
        }
    }

    public static void main(String[] args) {
        Car car = new Car(1234, 50000, 1000.50, new Date(2024 - 1900, 6 - 1, 30));

        System.out.println("Policy number: " + car.getPolicyNumber());
        System.out.println("Coverage amount: " + car.getCoverageAmount());
        System.out.println("Premium: " + car.calculatePremium());
        System.out.println("Expiry date: " + car.getExpiryDate());
    }
}
