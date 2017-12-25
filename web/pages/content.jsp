
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="pdf_viewer">
            <applet CODE="EmbedPDF.class" archive="<%=getServletContext().getContextPath()%>/jars/EmbedPDF.jar" WIDTH="850" HEIGHT="900">
                <param name="pdf" value="<%=request.getContextPath()%>/PdfContent?index=<%=request.getParameter("index")%>&session_id=<%=request.getSession().getId()%>"/>
                   <param name="enableOpenWindow" value="true"/>
                   <param name="enableSubpixAA" value="=true"/>
                   <param name="codebase_lookup" value="false"/>
                   <param name="classloader_cache" value="false"/>
                   <param name="java_arguments" value="-Djnlp.packEnabled=true -Xmx128m"/>
                   <param name="image" value="<%=getServletContext().getContextPath()%>/images/splash.gif"/>
                   <param name="boxborder" value="false"/>
                   <param name="centerimage" value="true"/>
            </applet>
        </div>
    </body>
</html>
