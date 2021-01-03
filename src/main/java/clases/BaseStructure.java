package clases;

public class BaseStructure {
    General generalObject;
    Device deviceObject;
    InitialReporter initialReporterObject;
    Manufacturers manufacturersObject;
    DeviceManufacturers deviceManufacturersObject;

    public General getGeneral() {
        return generalObject;
    }

    public Device getDevice() {
        return deviceObject;
    }

    public InitialReporter getInitialReporter() {
        return initialReporterObject;
    }

    public Manufacturers getManufacturers() {
        return manufacturersObject;
    }

    public DeviceManufacturers getDeviceManufacturers() {
        return deviceManufacturersObject;
    }

    public void setGeneral(General generalObject) {
        this.generalObject = generalObject;
    }

    public void setDevice(Device deviceObject) {
        this.deviceObject = deviceObject;
    }

    public void setInitialReporter(InitialReporter initialReporterObject) {
        this.initialReporterObject = initialReporterObject;
    }

    public void setManufacturers(Manufacturers manufacturersObject) {
        this.manufacturersObject = manufacturersObject;
    }

    public void setDeviceManufacturers(DeviceManufacturers deviceManufacturersObject) {
        this.deviceManufacturersObject = deviceManufacturersObject;
    }
}
