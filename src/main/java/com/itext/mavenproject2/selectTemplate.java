package com.itext.mavenproject2;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
//import com.itextpdf.kernel.color.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.AreaBreakType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class selectTemplate extends javax.swing.JFrame {
    String ema,nam,ids;
    public selectTemplate(String _name,String _email,String _id) {
        initComponents();
        nam = _name;
        ema = _email;
        ids = _id;
        String sql;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3307/e_magazine_generator";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            
            sql = "SELECT * FROM user";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String t = String.valueOf(rs.getInt("id"));
                if (t.equals(ids)){
                    name.setText(rs.getString("full_name"));
                    email.setText(rs.getString("email"));
                }
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        politics = new javax.swing.JButton();
        science = new javax.swing.JButton();
        sports = new javax.swing.JButton();
        economics = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        proceed = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name :");

        name.setEditable(false);
        name.setBackground(new java.awt.Color(0, 102, 102));
        name.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jlabel2.setBackground(new java.awt.Color(0, 102, 102));
        jlabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(255, 255, 255));
        jlabel2.setText("Email : ");

        email.setEditable(false);
        email.setBackground(new java.awt.Color(0, 102, 102));
        email.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Option", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        politics.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        politics.setText("POLITICS");
        politics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                politicsActionPerformed(evt);
            }
        });

        science.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        science.setText("SCIENCE");
        science.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scienceActionPerformed(evt);
            }
        });

        sports.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sports.setText("SPORTS");
        sports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsActionPerformed(evt);
            }
        });

        economics.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        economics.setText("ECONOMICS");
        economics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economicsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(politics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(science, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(economics, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(politics, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(science, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sports, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(economics, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        proceed.setBackground(new java.awt.Color(61, 155, 92));
        proceed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        proceed.setForeground(new java.awt.Color(255, 255, 255));
        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        PdfWriter pdfWriter;
        String path = "C:\\Users\\aashi\\OneDrive\\Desktop\\mag.pdf";
        try {
            pdfWriter = new PdfWriter(path);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            pdfDocument.addNewPage();
            
            
            //front page;
            String imgSrc1 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\front.png";
            ImageData data1;
            Image image1 = null;
            try {
                data1 = ImageDataFactory.create(imgSrc1);
                image1 = new Image(data1);
                image1.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-300,pdfDocument.getDefaultPageSize().getWidth()/2-350);
//                image1.setOpacity(0.33f);
            } catch (MalformedURLException ex) {
                Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
            }
            Document document = new Document(pdfDocument);
            document.add(image1);
            
            
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
            //index page;
            PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
            Text text1;
            
            text1 = new Text("Table of Content").setFont(font).setBold().setFontSize(48f);
            Paragraph paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            text1 = new Text("...........................................").setFont(font).setBold().setFontSize(48f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            text1 = new Text(" ").setFont(font).setBold().setFontSize(48f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            document.add(paragraph);
            document.add(paragraph);
            text1 = new Text("-> Politics").setFont(font).setBold().setFontSize(36f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            text1 = new Text(" ").setFont(font).setBold().setFontSize(48f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            text1 = new Text("->Technology").setFont(font).setBold().setFontSize(36f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            text1 = new Text(" ").setFont(font).setBold().setFontSize(48f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            text1 = new Text("->Sports").setFont(font).setBold().setFontSize(36f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            text1 = new Text(" ").setFont(font).setBold().setFontSize(48f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            text1 = new Text("->Economics").setFont(font).setBold().setFontSize(36f);
            paragraph = new Paragraph() 
                      .add(text1);
            document.add(paragraph);
            
            
            
            //Politics Page
            
            String imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\content.png";
            ImageData data3;
            Image image3 = null;
            //front page politics;
            try {
                data3 = ImageDataFactory.create(imgSrc3);
                image3 = new Image(data3);
                image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-360,pdfDocument.getDefaultPageSize().getHeight()/2-450);
                image3.setOpacity(0.33f);
           } catch (MalformedURLException ex) {
                Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.add(image3);
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
            imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\politics.png";
            
            try {
                data3 = ImageDataFactory.create(imgSrc3);
                image3 = new Image(data3);
                image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-360,pdfDocument.getDefaultPageSize().getHeight()/2-450);
//                image3.setOpacity(0.33f);
           } catch (MalformedURLException ex) {
                Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.add(image3);
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
//       
            try{
                //content with images politics;
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:MySQL://localhost:3307/e_magazine_generator";
                String user = "root";
                String pass = "";
                Connection con = DriverManager.getConnection(url,user,pass);
                Statement st = con.createStatement();
            
                String sql = "SELECT * FROM user";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    String t = String.valueOf(rs.getInt("id"));
                    System.out.println(t);
                    if (t.equals(ids)){
                        String pol = rs.getString("politics");
                        System.out.println(pol);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\politics2.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-150,pdfDocument.getDefaultPageSize().getWidth()/2-300);
//                            image3.setOpacity(0.5f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\politics1.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2+200);
                            image3.setOpacity(0.2f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        
                        int cnt =0;
                        System.out.println(pol);
                        String[] arrofStr = pol.split("\n",0);
                        System.out.println(cnt);
                        System.out.println(arrofStr);
                        int n = arrofStr.length;
                        String a = arrofStr[cnt];
                        System.out.println(a);
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n) break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph() 
                                    .add(text1);
                        document.add(paragraph);
                        cnt++;
                        if (cnt >= n) 
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph()
                                .add(text1);
                        document.add(paragraph);
                        if (cnt >= n)
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\politics4.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-150,pdfDocument.getDefaultPageSize().getWidth()/2 -200);
                            image3.setOpacity(0.5f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\politics3.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-250,pdfDocument.getDefaultPageSize().getWidth()/2+300);
                            image3.setOpacity(0.2f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph() 
                                    .add(text1);
                        document.add(paragraph);
                        cnt++;
                        if (cnt >= n) 
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph()
                                .add(text1);
                        document.add(paragraph);
                        if (cnt >= n)
                            break;
                        break;
                    }    
                }   
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            
            
            //Technology
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
            imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\science.png";
            //front page politics;
            try {
                data3 = ImageDataFactory.create(imgSrc3);
                image3 = new Image(data3);
                image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-360,pdfDocument.getDefaultPageSize().getHeight()/2-450);
//                image3.setOpacity(0.33f);
           } catch (MalformedURLException ex) {
                Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.add(image3);
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
//       
            try{
                //content with images politics;
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:MySQL://localhost:3307/e_magazine_generator";
                String user = "root";
                String pass = "";
                Connection con = DriverManager.getConnection(url,user,pass);
                Statement st = con.createStatement();
            
                String sql = "SELECT * FROM user";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    String t = String.valueOf(rs.getInt("id"));
                    if (t.equals(ids)){
                        String sci = rs.getString("science");
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\science2.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2 -300);
//                            image3.setOpacity(0.5f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\science1.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2+200);
                            image3.setOpacity(0.2f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        int cnt =0;
                        String[] arrofStr = sci.split("\n",0);
                        int n = arrofStr.length;
                        String a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n) break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph() 
                                    .add(text1);
                        document.add(paragraph);
                        cnt++;
                        if (cnt >= n) 
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph()
                                .add(text1);
                        document.add(paragraph);
                        if (cnt >= n)
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\science4.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2 -300);
//                            image3.setOpacity(0.5f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\science3.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2+200);
                            image3.setOpacity(0.2f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph() 
                                    .add(text1);
                        document.add(paragraph);
                        cnt++;
                        if (cnt >= n) 
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph()
                                .add(text1);
                        document.add(paragraph);
                        if (cnt >= n)
                            break;
                        break;
                    }
                }   
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            
            
            
            
            //sports
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
            imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\sports.png";
            //front page politics;
            try {
                data3 = ImageDataFactory.create(imgSrc3);
                image3 = new Image(data3);
                image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-360,pdfDocument.getDefaultPageSize().getHeight()/2-450);
//                image3.setOpacity(0.33f);
           } catch (MalformedURLException ex) {
                Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.add(image3);
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
//       
            try{
                //content with images politics;
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:MySQL://localhost:3307/e_magazine_generator";
                String user = "root";
                String pass = "";
                Connection con = DriverManager.getConnection(url,user,pass);
                Statement st = con.createStatement();
            
                String sql = "SELECT * FROM user";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    String t = String.valueOf(rs.getInt("id"));
                    if (t.equals(ids)){
                        String spo = rs.getString("sports");
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\sports2.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2 -300);
//                            image3.setOpacity(0.5f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\sports1.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2+200);
                            image3.setOpacity(0.2f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        int cnt =0;
                        String[] arrofStr = spo.split("\n",0);
                        int n = arrofStr.length;
                        String a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n) break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph() 
                                    .add(text1);
                        document.add(paragraph);
                        cnt++;
                        if (cnt >= n) 
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph()
                                .add(text1);
                        document.add(paragraph);
                        if (cnt >= n)
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\sports4.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2 -300);
//                            image3.setOpacity(0.5f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\sports3.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2+200);
                            image3.setOpacity(0.2f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph() 
                                    .add(text1);
                        document.add(paragraph);
                        cnt++;
                        if (cnt >= n) 
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph()
                                .add(text1);
                        document.add(paragraph);
                        
                        break;
                    }
                }   
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            
            //economics
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
            imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\economics.png";
            //front page politics;
            try {
                data3 = ImageDataFactory.create(imgSrc3);
                image3 = new Image(data3);
                image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-300,pdfDocument.getDefaultPageSize().getHeight()/2-500);
//                image3.setOpacity(0.33f);
           } catch (MalformedURLException ex) {
                Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.add(image3);
            document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
//       
            try{
                //content with images politics;
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:MySQL://localhost:3307/e_magazine_generator";
                String user = "root";
                String pass = "";
                Connection con = DriverManager.getConnection(url,user,pass);
                Statement st = con.createStatement();
            
                String sql = "SELECT * FROM user";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    String t = String.valueOf(rs.getInt("id"));
                    if (t.equals(ids)){
                        String eco = rs.getString("economics");
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\economics2.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2 -300);
//                            image3.setOpacity(0.5f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\economics1.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2+200);
                            image3.setOpacity(0.2f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        int cnt =0;
                        String[] arrofStr = eco.split("\n",0);
                        int n = arrofStr.length;
                        String a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n) break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph() 
                                    .add(text1);
                        document.add(paragraph);
                        cnt++;
                        if (cnt >= n) 
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph()
                                .add(text1);
                        document.add(paragraph);
                        if (cnt >= n)
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\economics4.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2 -300);
//                            image3.setOpacity(0.5f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        imgSrc3 = "C:\\Users\\aashi\\OneDrive\\Desktop\\mavenproject2\\src\\main\\java\\icon\\economics3.png";
                        System.out.println(imgSrc3);
                        try {
                            data3 = ImageDataFactory.create(imgSrc3);
                            image3 = new Image(data3);
                            image3.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth()/2-200,pdfDocument.getDefaultPageSize().getWidth()/2+200);
                            image3.setOpacity(0.2f);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        document.add(image3);
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph() 
                                    .add(text1);
                        document.add(paragraph);
                        cnt++;
                        if (cnt >= n) 
                            break;
                        a = arrofStr[cnt];
                        while (cnt < n && a.length() == 0){
                            cnt++;
                            a = arrofStr[cnt];
                        }
                        if (cnt >= n)
                            break;
                        text1 = new Text(a).setFontSize(17f);
                        paragraph = new Paragraph()
                                .add(text1);
                        document.add(paragraph);
                        break;
                    }
                }   
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            System.out.println("Hello World!");
            document.close();
            
//            JOptionPane.showMessageDialog(new JFrame(),"Saved at C:\\Users\\aashi\\OneDrive\\Desktop\\mag.pdf","Successfully Generated");
            JOptionPane.showMessageDialog(new JFrame(), "Saved at C:\\Users\\aashi\\OneDrive\\Desktop\\mag.pdf", "Successfully Generated",
                                    JOptionPane.PLAIN_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(selectTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_proceedActionPerformed

    private void politicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_politicsActionPerformed
        politics politicsFrame= new politics(nam,ema,ids);
        politicsFrame.setVisible(true);
        politicsFrame.pack();
        politicsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_politicsActionPerformed

    private void scienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scienceActionPerformed
        science scienceFrame= new science(nam,ema,ids);
        scienceFrame.setVisible(true);
        scienceFrame.pack();
        scienceFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_scienceActionPerformed

    private void sportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsActionPerformed
        sports sportsFrame= new sports(nam,ema,ids);
        sportsFrame.setVisible(true);
        sportsFrame.pack();
        sportsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_sportsActionPerformed

    private void economicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economicsActionPerformed
        economics economicsFrame= new economics(nam,ema,ids);
        economicsFrame.setVisible(true);
        economicsFrame.pack();
        economicsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_economicsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton economics;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JButton politics;
    private javax.swing.JButton proceed;
    private javax.swing.JButton science;
    private javax.swing.JButton sports;
    // End of variables declaration//GEN-END:variables
}
