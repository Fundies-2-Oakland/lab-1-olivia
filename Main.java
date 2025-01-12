public class Main {
    public static void main(String[] args) {
    }

    public class Vector3D {
        private double x;
        private double y;
        private double z;

        public Vector3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getZ() {
            return z;
        }

        public Vector3D add(double newX, double newY, double newZ) {
            return new Vector3D((this.x + newX), (this.y + newY), (this.z + newZ));
        }

        public Vector3D multiply(int constant) {
            double multipliedX = this.x * constant;
            double multipliedY = this.y * constant;
            double multipliedZ = this.z * constant;

            return new Vector3D(multipliedX, multipliedY, multipliedZ);
        }

        public double dotProduct(double newX, double newY, double newZ) {
            double combinedX = newX * this.x;
            double combinedY = newY * this.y;
            double combinedZ = newZ * this.z;

            return combinedX + combinedY + combinedZ;
        }
    }
}