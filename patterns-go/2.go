package main

import (
	"fmt"

	"cards"
)

func main() {
	store := cards.New()
	store["1111-2222-3333-4444"] = "John Doe"
	store2 := cards.New()
	fmt.Println(store2["1111-2222-3333-4444"])
}
