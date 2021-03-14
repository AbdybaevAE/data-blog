type Phone struct {
	cost int
}

func NewPhone(cost int) *Phone {
	return &Phone{cost}
}
func (p *Phone) GetCost() int {
	return p.cost
}

const CarbonEmissionCost = 1000

type Car struct {
	cost int
}

func NewCar(cost int) *Car {
	return &Car{cost}
}
func (c *Car) GetCost() int {
	return CarbonEmissionCost + c.cost
}