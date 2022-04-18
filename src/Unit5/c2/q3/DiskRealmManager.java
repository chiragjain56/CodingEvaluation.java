package Unit5.c2.q3;

class DiskRealmManager implements ReadDataManager, WriteDataManager {

    @Override
    public void read() {
        System.out.println("Reading DiskRealManager");
    }

    @Override
    public void write() {
        System.out.println("saving into Realm");
    }
}
