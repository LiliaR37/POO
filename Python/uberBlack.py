from car import Car

class UberBlack(car):
    typeCarAccepted = []
    setsMaterial = []

    def __init__(self,license, driver, typeCarAccepted,seatsMaterial ):
        super().__init__(license,driver)
        self.typeCarAccepted = typeCarAccepted
        self.setsMaterial = seatsMaterial