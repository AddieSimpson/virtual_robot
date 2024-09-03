package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="AddieTest")

public class AddieTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        double leftStickY = 0.0;
        int buttonPressCount = 0;
        boolean buttonPressed= false;

        waitForStart();

        while (opModeIsActive()) {

            leftStickY = -gamepad1.left_stick_y;

          /*  if (gamepad1.a) {
                buttonPressCount++;
            } */

            if (gamepad1.a && !buttonPressed){
                buttonPressed = true;
            buttonPressCount++;
        } else if (!gamepad1.a) {
            buttonPressed = false;

        }
            telemetry.addData("Left Stick Y", leftStickY);
            telemetry.addData("press count", buttonPressCount);
            telemetry.addData("press count Boolean", buttonPressed);
            telemetry.addData("gamepad a pressed", gamepad1.a);
            telemetry.update();
        }
    }
}
