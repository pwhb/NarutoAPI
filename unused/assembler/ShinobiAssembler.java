// package com.example.narutoapi.assembler;

// import com.example.narutoapi.controller.ShinobiController;
// import com.example.narutoapi.model.Shinobi;

// import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
// import org.springframework.hateoas.EntityModel;
// import org.springframework.hateoas.server.RepresentationModelAssembler;
// import org.springframework.stereotype.Component;

// @Component
// public class ShinobiAssembler implements RepresentationModelAssembler<Shinobi,EntityModel<Shinobi> {
//     @Override
//     public EntityModel<Shinobi> toModel(Shinobi shinobi) {
//         return EntityModel.of(shinobi, 
//         linkTo(methodOn(ShinobiController.class).one(shinobi.getFirstName())))
//     }
// }
