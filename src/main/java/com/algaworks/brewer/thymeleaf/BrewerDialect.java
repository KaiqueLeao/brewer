package com.algaworks.brewer.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.algaworks.brewer.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.algaworks.brewer.thymeleaf.processor.ClassMessageElementTagProcessor;
import com.algaworks.brewer.thymeleaf.processor.OrderElementTagProcessor;
import com.algaworks.brewer.thymeleaf.processor.PaginationElementTagProcessor;

public class BrewerDialect extends AbstractProcessorDialect {

	public BrewerDialect() {
		super("AlgaWorks Brewer", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
	}

	/**
	 * Adiciona os processadores criados para que possa fazer o processamento dos
	 * dialetos utilizados no nosso HTML
	 */
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new ClassMessageElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		return processadores;
	}

}
