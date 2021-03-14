package abstract_factory

type adidasShirt struct {
	shirt
}
type adidasShoe struct {
	shoe
}

type adidas struct{}

func (n *adidas) Shoe() iShoe {
	return &adidasShoe{shoe: shoe{logo: "Adidas", size: 14}}
}
func (n *adidas) Shirt() iShirt {
	return &adidasShirt{shirt: shirt{logo: "Adidas", size: 30}}
}
