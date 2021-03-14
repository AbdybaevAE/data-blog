package abstract_factory

type nike struct{}

type nikeShirt struct {
	shirt
}
type nikeShoe struct {
	shoe
}

func (n *nike) Shoe() iShoe {
	return &nikeShoe{shoe: shoe{logo: "Nike", size: 10}}
}
func (n *nike) Shirt() iShirt {
	return &nikeShirt{shirt: shirt{logo: "Nike", size: 20}}
}
