package springmvc.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadcontroller {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model model) {

		// System.out.println(file.getSize());
		// System.out.println(file.getContentType());
		// System.out.println(file.getName());
		// System.out.println(file.getOriginalFilename());
		// System.out.println(file.getStorageDescription());

		byte[] data = file.getBytes();
		// We have to save this file to server

		String path = s.getServletContext().getRealPath("/WEB-INF/resources/image/" + file.getOriginalFilename());

		System.out.println(path);

		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File uploaded...");
			model.addAttribute("msg", "uploaded Successfully");
			model.addAttribute("filename", file.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("uploading Error...");
			model.addAttribute("msg", "uploading Error...");

		}

		return "filesuccess";

	}

}
