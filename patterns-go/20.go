type VgaClient struct{}

func (c *VgaClient) plugVgaToDevice(d VgaDevice) {
	d.acceptVgaConnector()
}

type VgaDevice interface {
	acceptVgaConnector()
}
type HdmiDevice interface {
	acceptHdmiConnector()
}
type VgaDisplay struct{}

func (d *VgaDisplay) acceptVgaConnector() {
	fmt.Println("Accepted vga connector")
}

type HdmiDisplay struct{}

func (d *HdmiDisplay) acceptHdmiConnector() {
	fmt.Println("Accept hdmi connector")
}

type HdmiToVgaAdapter struct {
	device VgaDevice
}

func (h *HdmiToVgaAdapter) acceptHdmiConnector() {
	// convert signal from HDMI to VGA
	h.device.acceptVgaConnector()
}