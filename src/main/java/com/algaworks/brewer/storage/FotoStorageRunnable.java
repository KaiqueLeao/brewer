package com.algaworks.brewer.storage;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.brewer.dto.FotoDTO;

public class FotoStorageRunnable implements Runnable {

	private MultipartFile[] files;
	private DeferredResult<FotoDTO> resultado;
	
	public FotoStorageRunnable(MultipartFile[] files, DeferredResult<FotoDTO> resultado) {
		super();
		this.files = files;
		this.resultado = resultado;
	}

	@Override
	public void run() {
		System.out.println("Arquivo Upload: " + files[0].getSize());
		
		String nomeFoto = files[0].getOriginalFilename();
		String contentType = files[0].getContentType();
		
		resultado.setResult(new FotoDTO(nomeFoto, contentType));
	}

}