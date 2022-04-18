package Unit5.c2.q3;

class DiskCoreDataManager implements ReadDataManager, WriteDataManager {

    @Override
    public void read() {
        System.out.println("Reading DiskCoreDataManager");
    }

    @Override
    public void write() {
        System.out.println("Saving into Realm");
    }
}
