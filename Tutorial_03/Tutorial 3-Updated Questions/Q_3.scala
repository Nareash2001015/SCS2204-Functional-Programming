object Q_3{
    def main(args: Array[String]) = {
        print(sphereVolume(5))
    }
    def sphereVolume(r: Float): Double = {
        r * r * r * math.Pi * (4.0/3.0)
    }
}