package com.builder;

public class PaySlip {

    private final int basic;
    private final int homeRentAllowance;
    private final int lunchAllowance;
    private final int medicalAllowance;
    private final int travelAllowance;

    public PaySlip(Builder paySlipBuilder) {
        this.basic = paySlipBuilder.basic;
        this.homeRentAllowance = paySlipBuilder.homeRentAllowance;
        this.lunchAllowance = paySlipBuilder.lunchAllowance;
        this.medicalAllowance = paySlipBuilder.medicalAllowance;
        this.travelAllowance = paySlipBuilder.travelAllowance;
    }

    @Override
    public String toString() {
        return "PaySlip{" +
                "basic=" + basic +
                ", homeRentAllowance=" + homeRentAllowance +
                ", lunchAllowance=" + lunchAllowance +
                ", medicalAllowance=" + medicalAllowance +
                ", travelAllowance=" + travelAllowance +
                '}';
    }

    public static class Builder {
        private int basic;
        private int homeRentAllowance;
        private int lunchAllowance;
        private int medicalAllowance;
        private int travelAllowance;

        public Builder setBasic(int basic) {
            this.basic = basic;
            return this;
        }

        public Builder setHomeRentAllowance(int homeRentAllowance) {
            this.homeRentAllowance = homeRentAllowance;
            return this;
        }

        public Builder setLunchAllowance(int lunchAllowance) {
            this.lunchAllowance = lunchAllowance;
            return this;
        }

        public Builder setMedicalAllowance(int medicalAllowance) {
            this.medicalAllowance = medicalAllowance;
            return this;
        }

        public Builder setTravelAllowance(int travelAllowance) {
            this.travelAllowance = travelAllowance;
            return this;
        }

        public PaySlip build() {
            return new PaySlip(this);
        }
    }

}
