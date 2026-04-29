# Cinema Booking System (Java)

Progetto di un sistema di gestione prenotazioni cinematografiche sviluppato in Java, focalizzato sull'applicazione dei principi **SOLID** e del **Clean Code**.

## 🛠️ Caratteristiche Tecniche
- **Polimorfismo e Interfacce**: Utilizzo di interfacce (`User`, `Event`) per garantire la scalabilità del sistema.
- **Incapsulamento**: Gestione rigorosa degli stati interni (es. posti in `Hall`).
- **Error Handling**: Gestione delle eccezioni personalizzate (es. posto già occupato).
- **Architecture**: Separazione netta tra Modelli (Dati) e Servizi (Logica di business).

## 🚀 Come avviare il progetto
1. Clona il repository: `git clone https://github.com/LiaciGiuseppe/cinema-booking-java`
2. Compila il progetto: `javac com/LiaciGiuseppe/Movie/CinemaApplication.java`
3. Esegui: `java com.LiaciGiuseppe.Movie.CinemaApplication`

## 🧠 Scelte Progettuali
Ho scelto di separare `Event` da `Hall` per permettere la proiezione dello stesso evento in sale diverse, seguendo il principio di **Single Responsibility**.