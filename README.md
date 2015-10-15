# DrawingBoard-Android
This is a library for custom drawing using canvas. By adding this module, you can integrate a drawing board where you can easily draw anything and can be later saved as an image.

#Setup

1. Download the drawingboard.aar file to your system
2. Add drawingboard.aar file to the project by following the below step:
    * In Android Studio select File -> New Module -> Import .JAR/.AAR and import drawingboard.aar file from your           system.
    * Put Subproject name as 'drawingboard'
    * Then in your project build.gradle (the one under 'app') add the following (in the dependencies section):
    ```
        dependencies {
          compile project(':drawingboard')
        }
    ```
    - Note project name 'drawingboard' should match the name of the folder that was added after you imported the         AAR file
3. Synchronize gradle (using toolbar button or in File->Synchronize) after you do this.

 # Integrate DrawingBoard to your xml
 
 ```
 <com.suyati.telvin.signatureview.DrawingBoard
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/drawinboard"/>
 ```
 # Customize your DrawingBoard
 
  * To change the board color 
   ```
  drawingBoard.setCanvasColor(android.R.color.white);
  ```
  
  * To change the pen color 
  ```
  drawingBoard.setPenColor(R.color.colorPrimary);
  ```
  
  * To change the pen width 
  ```
  drawingBoard.setPenWidth(6f);
  ```
  
#DrawingBoard Actions

* To clear the drawing on the board
  ```
  drawingBoard.clearBoard;
  ```
  
* To save as image file 
  ```
  String baseFilePath = "ProjectName/Images";
  String fileName = "darwboard1.png";
  Boolean isShownInGallery = true;
  
  drawingBoard.setBaseFilePath(baseFilePath);
  drawingBoard.setBaseFilePath(fileName,isShownInGallery); 
  ```
  
  * To get Bitmap of current drawing on the board
  ```
  drawingBoard.getBitMapSignature();
  ```
 
 #Authors and Contributors

DrawingBoard-Android is developed by Suyati Technologies. It is written and maintained by their Android Development team.

Author:

* **Telvin Philips Mathew (@telvinphilipsmathew)**

#Support or Contact

Have Suggestions? Want to give us something to do? Contact us at : support@suyati.com

