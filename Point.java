class Point {
	String id
	double x,y;
        String s = "blue"

	//TODO add new variable

	//TODO constructor
        this.id = id
        this.x = x
        this.y = y
        this.s = s
	//TODO setters and getters
        String *getId(){
        return id }
        double getX() {
        return x; }
        double getY() {
        return y; }
        String getS() {
        return s; }
    
        void setID(String id){
        this.id =id; }
        void setX(double x){
        this.x=x; }
        void setY(double y){
        this.y=y; }
        void setS(String s) {
        this.s=s; }
       

	public void move (char xDirection, char yDirection) {
		//TODO
	}

	public void draw () {
		//TODO
	}



}
