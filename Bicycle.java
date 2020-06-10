

	class Bicycle {

	    int cadence = 0;
	    int speed = 0;
	    int gear = 1;
	    public Bicycle( int startCadence,
               int startSpeed,
               int startGear) {
	    	this.cadence = startCadence;
	    	this.speed = startSpeed;
	    	this.gear = startGear;
	    }

	    void changeCadence(int newValue) {
	         cadence = newValue;
	    }

	    void changeGear(int newValue) {
	         gear = newValue;
	    }

	    void speedUp(int increment) {
	         speed = speed + increment;   
	    }

	    void applyBrakes(int decrement) {
	         speed = speed - decrement;
	    }

	

		@Override
		public String toString() {
			return "Bicycle [cadence=" + cadence + ", speed=" + speed + ", gear=" + gear + "]";
		}

		void printStates() {
	         System.out.println("cadence:" +
	             cadence + " speed:" + 
	             speed + " gear:" + gear);
	    }
	    public void printDescription(){
	        System.out.println("\nBike is " + "in gear " + this.gear
	            + " with a cadence of " + this.cadence +
	            " and travelling at a speed of " + this.speed + ". ");
	    }
	}