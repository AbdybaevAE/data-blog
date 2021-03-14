type ProductType int

const (
	PhoneType ProductType = iota
	CarType
)

type ProductFactory struct {
}

func (s *ProductFactory) NewProduct(p ProductType, cost int) Product {
	switch p {
	case PhoneType:
		return NewPhone(cost)
	case CarType:
		return NewCar(cost)
	}
	return nil
}
