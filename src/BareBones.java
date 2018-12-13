public abstract class BareBones {

        private int health;
        private int strength;
        private int intelligence;
        private int speed;

        public BareBones (){
            this.health = 5;
            this.strength = 3;
            this.intelligence = 3 ;
            this.speed = 3;}


        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public int getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed (int speed){
            this.speed = speed ;


        }
    }
