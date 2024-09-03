package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="AddieTest")

public class AddieTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("gamepad a pressed", gamepad1.a);
            telemetry.update();
        }
    }
}
