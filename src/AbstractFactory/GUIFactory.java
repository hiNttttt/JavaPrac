package AbstractFactory;



public interface GUIFactory {
    Car createCar();
    Driver createDriver();
    Movement createMovement();
}

interface Car {
}
interface Movement {
}
interface Driver {
}
//+++++++++++++++++++++++++
class Econom implements Car {

}
class carDriver implements Driver {

}
class Drives implements Movement {

}
//+++++++++++++++++++++++++
class Cargo implements Car {

}
class cargoDriver implements Driver {

}
class Trudges implements Movement {

}
//+++++++++++++++++++++++++
class Motorbike implements Car {

}
class Biker implements Driver {

}
class Rides implements Movement {

}