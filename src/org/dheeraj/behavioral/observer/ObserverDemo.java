package org.dheeraj.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        NewsChannels aajtak = new NewsChannels("Aaj tak");
        NewsChannels zeenews = new NewsChannels("Zee News");
        NewsChannels republic = new NewsChannels("Republic TV");
        NewsChannels ndtv = new NewsChannels("NDTV");
        NewsChannels abp = new NewsChannels("ABP News");

        PressTrustofIndia pressTrustofIndia = new PressTrustofIndia();
        aajtak.subscribe(pressTrustofIndia);
        zeenews.subscribe(pressTrustofIndia);
        republic.subscribe(pressTrustofIndia);
        ndtv.subscribe(pressTrustofIndia);
        abp.subscribe(pressTrustofIndia);

        pressTrustofIndia.pushMessage("According to PTI : The India Pakistan Match is drawn");

        ndtv.unSubscribe();

        System.out.println();
        System.out.println("*******************************");

        pressTrustofIndia.pushMessage("According to PTI : The India Pakistan Match is drawn and india Won the Trophy");

        System.out.println();
        System.out.println("*******************************");
        ndtv.subscribe(pressTrustofIndia);


        pressTrustofIndia.pushMessage("According to PTI : Sachin Tendulkar is the Man of Match");

    }

}
