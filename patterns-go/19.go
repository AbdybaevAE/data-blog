func main() {
	adidasFactory := abstract_factory.NewWearFactory(abstract_factory.Adidas)
	nikeFactory := abstract_factory.NewWearFactory(abstract_factory.Nike)

	shoe1 := nikeFactory.Shoe()
	shirt1 := nikeFactory.Shirt()
	shoe2 := adidasFactory.Shoe()
	shirt2 := adidasFactory.Shirt()
	fmt.Printf("%v \n", shoe1)
	fmt.Printf("%v \n", shoe2)
	fmt.Printf("%v \n", shirt1)
	fmt.Printf("%v \n", shirt2)
}
