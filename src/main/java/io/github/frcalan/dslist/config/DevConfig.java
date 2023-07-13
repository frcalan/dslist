package io.github.frcalan.dslist.config;

import io.github.frcalan.dslist.entities.Game;
import io.github.frcalan.dslist.entities.GameList;
import io.github.frcalan.dslist.repositories.GameListRepository;
import io.github.frcalan.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Override
    public void run(String... args) throws Exception {
       /* GameList gameList1 = new GameList(null, "Games Esports");
        GameList gameList2 = new GameList(null, "Games Aventura");

        Game game1 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
        Game game2 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        Game game3 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        Game game4 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        Game game5 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        Game game6 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        Game game7 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        Game game8 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        Game game9 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        Game game10 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Adventure",
                "Role-playing (RPG), Shooter", 4.5, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        gameListRepository.saveAll(Arrays.asList(gameList1,gameList2));

        gameRepository.saveAll(Arrays.asList(game1,game2,game3,game4, game5, game6, game7, game8, game9, game10));
*/

    }
}
