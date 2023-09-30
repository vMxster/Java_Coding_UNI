class Train {
	int nTotSeats;
	int nFirstClassSeats;
	int nSecondClassSeats;
	int nFirstClassReservedSeats;
	int nSecondClassReservedSeats;
	
	void build (int nTotSeats, int nFirstClassSeats, int nSecondClassSeats, int nFirstClassReservedSeats, int nSecondClassReservedSeats) {
		this.nTotSeats = nTotSeats;
		this.nFirstClassSeats = nFirstClassSeats;
		this.nSecondClassSeats = nSecondClassSeats;
		this.nFirstClassReservedSeats = nFirstClassReservedSeats;
		this.nSecondClassReservedSeats = nSecondClassReservedSeats;
	}
	void reserveFirstClassSeats(int num1stSeats) {
		this.nFirstClassReservedSeats += num1stSeats;
	}
	void reserveSecondClassSeats(int num2ndSeats) {
		this.nSecondClassReservedSeats += num2ndSeats;
	}
	double getTotOccupancyRatio() {
		double TotReservedSeats = this.nFirstClassReservedSeats + this.nSecondClassReservedSeats;
		double TotOccupancyRatio = (100*TotReservedSeats)/this.nTotSeats;
		return TotOccupancyRatio;
	}
	double getFirstClassOccupancyRatio() {
		double FirstClassOccupancyRatio = (100*nSecondClassReservedSeats)/this.nSecondClassSeats;
		return FirstClassOccupancyRatio;
	}
	double getSecondClassOccupancyRatio() {
		double SecondClassOccupancyRatio = (100*nFirstClassReservedSeats)/this.nFirstClassSeats;
		return SecondClassOccupancyRatio;
	}
	void deleteAllReservations() {
		this.nFirstClassReservedSeats = this.nFirstClassSeats;
		this.nSecondClassReservedSeats = this.nSecondClassSeats;
	}
}