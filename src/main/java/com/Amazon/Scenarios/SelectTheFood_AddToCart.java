package com.Amazon.Scenarios;

import com.Amazon.ClassObjectlerim;

public class SelectTheFood_AddToCart extends ClassObjectlerim {

    //INTELLIJ'DEKI JAVA-MAVEN-SELENIUM FRAMEWORK'UMDE SUANLIK SADECE 1 TEST(SCENARIO) VARDIR.
    //O DA BU CLASIN ICINDE ASAGIDAKI GIBIDIR

    public static void main(String[] args) throws InterruptedException {

        //Benim 1 tane TESTCASE'IM VAR.
        //SCENARIO'su Indigo websitesinden kitap secip, sepete eklemektir.
        //Bu testcase'im 6 tane TEST STEP'ten olusmaktadir.


        //TEST CASE 1 - TC01
        testStepMethodlari.launchChromeBrowser_and_navigateToTheUrl();//TEST STEP1 - TS01
        testStepMethodlari.searchForTheFood_inAmazon();//TEST STEP2 -TS02
        testStepMethodlari.enter();//TEST STEP2 -TS03
        testStepMethodlari.clickFirstPicture(); //STEP3
        testStepMethodlari.clickAddToCartButton();//TEST STEP4
        testStepMethodlari.clickViewMyCartButton();//TEST STEP5
        testStepMethodlari.proceedToCheckOut();//TEST STEP6
        testStepMethodlari.putMyCredentialsToLogin();//TEST STEP7



    }
}
