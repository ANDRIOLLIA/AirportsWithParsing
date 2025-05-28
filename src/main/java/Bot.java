import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public class Bot extends TelegramLongPollingBot {

    //TODO Кнопка для вывода всех аэропортов
    private InlineKeyboardButton buttonForOutputAllAirports = InlineKeyboardButton.builder()
            .text("Список всех аэропортов")
            .callbackData("list all airports")
            .build();

    //TODO Кнопка для вывода списка вылетов
    private InlineKeyboardButton buttonForOutputListDepartureFlight = InlineKeyboardButton.builder()
            .text("Список вылетов из конкретного аэропорта")
            .callbackData("list departure flight")
            .build();

    //TODO Кнопка для вывода прилетов
    private InlineKeyboardButton buttonForOutputListArrivalFlight = InlineKeyboardButton.builder()
            .text("Список прилетов из конкретного аэропорта")
            .callbackData("list arrival flights")
            .build();

    //TODO Кнопка для вывода ближайшего рейса в выбранном аэропорте
    private InlineKeyboardButton buttonForOutputFirstDepartureFlight = InlineKeyboardButton.builder()
            .text("Ближайший вылет из выбранного аэропорта")
            .callbackData("first departure flight")
            .build();

    private InlineKeyboardMarkup keyboardWithMainCommands = InlineKeyboardMarkup.builder()
            .keyboardRow(List.of(buttonForOutputAllAirports))
            .keyboardRow(List.of(buttonForOutputFirstDepartureFlight))
            .keyboardRow(List.of(buttonForOutputListArrivalFlight))
            .keyboardRow(List.of(buttonForOutputFirstDepartureFlight))
            .build();

    @Override
    public void onUpdateReceived(Update update) {
        forWorkWithText(update);
    }

    private void forWorkWithText(Update update){
        if(update.hasMessage()){
            String textMessage = update.getMessage().getText();
            if (textMessage.compareToIgnoreCase("/start") == 0){
                Long userId = update.getMessage().getFrom().getId();
                SendMessage sendMessage = SendMessage.builder()
                        .chatId(userId)
                        .text("Выберите действие: ")
                        .replyMarkup(keyboardWithMainCommands)
                        .build();

                try{
                    execute(sendMessage);
                }catch (Exception ex){
                    ex.getMessage();
                }
            }
        }
    }



    @Override
    public String getBotUsername() {
        return "@MatosyanTGBot";
    }

    @Override
    public String getBotToken() {
        return "8004012680:AAEfvyYY8R44wFfIGunrWkTFaowWxH5-zbE";
    }

}