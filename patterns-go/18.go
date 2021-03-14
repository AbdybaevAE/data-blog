package abstract_factory

type iWearFactory interface {
	Shoe() iShoe
	Shirt() iShirt
}

type Brands int

const (
	Nike Brands = iota
	Adidas
)

func NewWearFactory(brand Brands) iWearFactory {
	switch brand {
	case Nike:
		return &nike{}
	case Adidas:
		return &adidas{}
	}
	return nil
}
