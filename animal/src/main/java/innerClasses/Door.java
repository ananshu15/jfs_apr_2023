package innerClasses;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Door {
    private Lock lock;

    public Door() {
        lock = new Lock(true);
    }

    public void shopStatus() {
        if (lock.isLock()) {
            System.out.println("Shop is closed");
        } else {
            System.out.println("Shop is open");
        }
    }

    public class Lock {
        private boolean lock;

        public Lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }

}
