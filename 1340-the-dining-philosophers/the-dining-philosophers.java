class DiningPhilosophers {

    Semaphore[] fork = new Semaphore[5];
    Semaphore table = new Semaphore(4);

    public DiningPhilosophers() {
        for (int i = 0; i < 5; i++)
            fork[i] = new Semaphore(1);
    }

    public void wantsToEat(int id,
        Runnable pickLeftFork,
        Runnable pickRightFork,
        Runnable eat,
        Runnable putLeftFork,
        Runnable putRightFork) throws InterruptedException {

        int left = id;
        int right = (id + 1) % 5;

        table.acquire();

        fork[left].acquire();
        fork[right].acquire();

        pickLeftFork.run();
        pickRightFork.run();
        eat.run();
        putLeftFork.run();
        putRightFork.run();

        fork[left].release();
        fork[right].release();

        table.release();
    }
}