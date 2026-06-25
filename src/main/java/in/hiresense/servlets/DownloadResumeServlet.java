package in.hiresense.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import in.hiresense.dao.ApplicationDAO;
import in.hiresense.models.ApplicationPojo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DownloadResume")
public class DownloadResumeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        try {

            String appIdStr = request.getParameter("appId");

            if (appIdStr == null) {
                response.sendRedirect("error.jsp");
                return;
            }

            int appId = Integer.parseInt(appIdStr);

            ApplicationPojo app =
                    ApplicationDAO.getApplicationById(appId);

            if (app == null
                    || app.getResumePath() == null
                    || app.getResumePath().isEmpty()) {
                response.sendRedirect("error.jsp");
                return;
            }

            File file = new File(app.getResumePath());

            if (!file.exists()) {
                response.sendRedirect("error.jsp");
                return;
            }

            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition",
                    "attachment; filename=\"" 
                    + file.getName() + "\"");

            FileInputStream fis = new FileInputStream(file);
            OutputStream os = response.getOutputStream();

            byte[] buffer = new byte[4096];
            int bytes;

            while ((bytes = fis.read(buffer)) != -1) {
                os.write(buffer, 0, bytes);
            }

            fis.close();
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
