package com.curso;

import static org.junit.Assert.*;

import java.util.Optional;
import org.junit.Test;

public class TestOptional {

	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
	    Optional<String> empty = Optional.empty();
	    //System.out.println(empty.isPresent());
	    assertFalse(empty.isPresent());
	}
	
	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.of(name);
	    assertTrue(opt.isPresent());
	}
	
	@Test(expected = NullPointerException.class)
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
	    String name = null;
	    Optional.of(name);
	}
	
	@Test
	public void givenNonNull_whenCreatesNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.ofNullable(name);
	    assertTrue(opt.isPresent());
	}
	
	@Test
	public void givenNull_whenCreatesNullable_thenCorrect() {
	    String name = null;
	    Optional<String> opt = Optional.ofNullable(name);
	    assertFalse(opt.isPresent());
	}
	
	@Test
	public void givenOptional_whenIsPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertTrue(opt.isPresent());

	    opt = Optional.ofNullable(null);
	    assertFalse(opt.isPresent());
	}
	
	@Test
	public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertFalse(opt.isEmpty());

	    opt = Optional.ofNullable(null);
	    assertTrue(opt.isEmpty());
	}
	
	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("baeldung");
	    //opt.ifPresent(name -> System.out.println(name.length()));
	}

	@Test
	public void whenOrElseWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("john");
	    assertEquals("john", name);
	}
	
	
	@Test
	public void whenOrElseGetWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
	    assertEquals("john", name);
	}
	
//	@Test
//	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
//	    String text = null;
//	    
//	    String defaultText;
//
//	    defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
//	    assertEquals("Default Value", defaultText);
//
//	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
//	    assertEquals("Default Value", defaultText);
//	}
	
	public String getMyDefault() {
		//LOGICA COSTOSA
		for (int x=0;x<20;x++) {
		    System.out.println("Getting Default Value: "+x);
		}
	    return "Default Value";
	}
	
	@Test
	public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
	    String text = "Text present";
	    String defaultText ;

	    System.out.println("Using orElseGet:");
	    defaultText = Optional.ofNullable(text).orElseGet(()->this.getMyDefault());
	    //NO EJECUTA .orElseGet
	    assertEquals("Text present", defaultText);

//	    System.out.println("Using orElse:");
//	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
//	    //SI EJECUTA .orElseGet
//	    System.out.println("*****"+defaultText);
//	    assertEquals("Text present", defaultText);
	}
	
	
	
	
}
