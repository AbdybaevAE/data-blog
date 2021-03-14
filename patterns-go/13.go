func main() {
	products := []factory.Product{factory.NewCar(2000), factory.NewPhone(800)}
	totalCost := 0
	for _, v := range products {
		totalCost += v.GetCost()
	}
	fmt.Printf("Total cost: %v$ ", totalCost)
}
